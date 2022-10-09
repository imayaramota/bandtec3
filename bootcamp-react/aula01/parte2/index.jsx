const root = window.document.getElementById('root');

function Candidato(props){
    // pega votos e set ele, useState cria um estado e vai começar com 0
    const [votos, setVotos] = React.useState(0);

    function votar() {
        setVotos(votos + 1);
    }
    return(
        <>
            <h1>{props.nome}</h1>
            <h2>Votos: {votos}</h2>
            <button onClick={votar}>Click para votar</button>
        </>   
        );
}

function Votacao() {
    return(
            <>
            <h1>Votação Candidatos:</h1>
            <Candidato nome= "batata frita com frango" />
            <Candidato nome= "batata cozida com frango" />
            </>
    ); 
}
ReactDOM.createRoot(root).render(<Votacao />);
