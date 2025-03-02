const markToColor = {
    "S": "#FFD700",  // Gold for Superlative
    "A": "#32CD32",  // Lime Green for Excellent
    "B": "#20B2AA",  // Light Sea Green for Good
    "C": "#FF7F50",  // Coral for Sufficient
    "D": "#FF8C00",  // Dark Orange for Insufficient
    "F": "#B22222"   // Firebrick Red for Failure
};

function colorMarks() {
    const divs = document.querySelectorAll(".mark")
    console.log(divs)
    divs.forEach(div => {
        const mark = div.querySelector("span").innerText.trim();
        if (markToColor[mark]) div.style.backgroundColor = markToColor[mark]
    });
}

document.addEventListener("DOMContentLoaded", colorMarks);
