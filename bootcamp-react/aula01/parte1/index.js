// const root = window.document.getElementById('root');
// const titulo = window.document.createElement('h1');
// titulo.innerHTML = "Meu primeiro tirulo com JS";
// root.appendChild(titulo);

const root = window.document.getElementById('root');
function Titulo(props){
    return(
            <h1>Salada de frutas {props.texto}
            <br /> Valor: {10 + 10}</h1>
        );
}
function Titulos(){
    return(
        <>
            <Titulo texto="banana" />
            <Titulo texto="morango"/>
            <Titulo texto="amora"/>
        </>
    );
}
//dom ache a raiz e rendeiza o tirulo
// ReactDOM.createRoot(root).render(<Titulo />);
ReactDOM.createRoot(root).render(<Titulos />);
