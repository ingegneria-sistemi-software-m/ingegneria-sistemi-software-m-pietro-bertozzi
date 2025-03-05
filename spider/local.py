import os
import argparse
from bs4 import BeautifulSoup

def parse_local_files(directory, keywords=None, absolute=False):
    found_pages = {keyword: [] for keyword in keywords} if keywords else {}
    visited_pages = []
    for root, _, files in os.walk(directory):
        for file in files:
            if not file.endswith(".html"):
                continue
            filepath = os.path.join(root, file)
            visited_pages.append(filepath)
            with open(filepath, "r", encoding="utf-8") as f:
                soup = BeautifulSoup(f, "html.parser")
                for a_tag in soup.find_all('a'):
                    a_tag.decompose()
                text = soup.get_text().lower()
                if keywords:
                    for keyword in keywords:
                        if f" {keyword.lower()} " in f" {text} ":
                            found_pages[keyword].append(filepath)
    print("Visited HTML:")
    for page in visited_pages:
        if absolute:
            print(f"  - {page}")
        else:
            print(f"  - {os.path.relpath(page, directory)}")
    return found_pages

def main():
    parser = argparse.ArgumentParser(description="Local HTML Spider")
    parser.add_argument(
        "-k", "--keywords", 
        nargs="*",
        help="Keywords list"
    )
    parser.add_argument(
        "-d", "--directory", 
        nargs="?",
        default="/mnt/c/Users/HP/OneDrive/Desktop/Magistrale/ingegneria-sistemi-software-m/ingegneria-sistemi-software-m-professore/iss25Material/docs/_build",
        help="Search directory"
    )
    parser.add_argument(
        "-a", "--absolute",
        action="store_true",
        help="Print absolute paths"
    )
    args = parser.parse_args()

    result = parse_local_files(args.directory, args.keywords, args.absolute)

    if args.keywords:
        for keyword, pages in result.items():
            print(f"Keyword '{keyword}' found in the following HTML:")
            for page in pages:
                if args.absolute:
                    print(f"  - {page}")
                else:
                    print(f"  - {os.path.relpath(page, args.directory)}")

if __name__ == "__main__":
    main()
