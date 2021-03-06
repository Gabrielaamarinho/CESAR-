tituloQuestao = document.getElementById("tituloQuestao");
instrucoesQuestao = document.getElementById("instrucoesQuestao");
entradaQuestao = document.getElementById("entradaQuestao");
saidaQuestao = document.getElementById("saidaQuestao");
tempoExecucao = document.getElementById("tempoExecucao");
fonteQuestao = document.getElementById("fonteQuestao");
turmasQuestao = document.getElementById("turmasQuestao");
cadastroBtn = document.getElementById("cadastroQuestaoBtn");


cadastroBtn.addEventListener("click", postApi);

function cadastrar(e) {
    console.log(tituloQuestao.value);
    console.log(instrucoesQuestao.value);
    console.log(entradaQuestao.value);
    console.log(saidaQuestao.value);
    console.log(document.querySelector('input[name="inlineRadioOptions"]:checked').value);
    console.log(tempoExecucao.value);
    console.log(fonteQuestao.value);
    console.log(turmasQuestao.value);

    e.preventDefault();
}


function postApi (e) {
    const opcoes = {
        method: 'POST',
        headers: {'Content-Type': 'application/json' },
        body: JSON.stringify({
            titulo: tituloQuestao.value,
            textoQuestao: instrucoesQuestao.value,
            entrada: entradaQuestao.value,
            saida: saidaQuestao.value,
            nivelQuestao: document.querySelector('input[name="inlineRadioOptions"]:checked').value,
            tempoExecucao: tempoExecucao.value,
            fonteQuestao: fonteQuestao.value,
            turmasQuestao: turmasQuestao.value,
        })
    }
    e.preventDefault();
    return fetch(`http://localhost:9000/exercicio`,opcoes);
}; 