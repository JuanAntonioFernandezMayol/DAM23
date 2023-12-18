function grande(){
    let parrafos = document.querySelectorAll("p")
    for (const parrafo of parrafos) {
        parrafo.style.fontSize = "2rem"
    }
}

function pequeño(){
    let parrafos = document.querySelectorAll("p")
    for (const parrafo of parrafos) {
        parrafo.style.fontSize = "0.8rem"
    }
}