let nouParagraf = document.createElement("p");
function mas() {
nouParagraf.textContent = "Aquest és un nou paràgraf.";
document.body.appendChild(nouParagraf);
}

function menos(){
    document.body.removeChild(nouParagraf);
}