nomeCompleto = document.getElementById("nomesobrenome");
userName = document.getElementById("username");
email = document.getElementById("email");
senha= document.getElementById("senha");
cadastroBtn = document.getElementById("btnCadastro");


cadastroBtn.addEventListener("click", postApi);

function cadastrar(e) {
    console.log(nomeCompleto.value);
    console.log(userName.value);
    console.log(email.value);
    console.log(senha.value);

    e.preventDefault();
}



function postApi (e) {
    const opcoes = {
        method: 'POST',
        headers: {'Content-Type': 'application/json' },
        body: JSON.stringify({
            nomeCompleto: nomeCompleto.value,
            username: userName.value,
            emailAluno: email.value,
            senha: senha.value,
        })
    }
    e.preventDefault();
    return fetch(`http://localhost:9000/aluno`,opcoes);
}; 