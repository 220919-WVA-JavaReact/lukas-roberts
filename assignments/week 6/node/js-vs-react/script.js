
console.log("Hello World!");
const jsContainer = document.getElementById('mountNode');
const reactContainer = document.getElementById('mountNode2');
const root = ReactDOM.createRoot(reactContainer);

function Demo() {
    return (
        
        <div className="demo">
            Hello React
            <input/>
            <p>{new Date().toString()}</p>
        </div>
    )
}

const update = () => {

    jsContainer.innerHTML = `
    <div class="demo">
        Hello Js
        <input/>
        <p>${new Date()}</p>
    </div>
    `;

    // root.render(
    //     React.createElement(
    //         "div",
    //         { className: "demo"},
    //         "Hello React",
    //         React.createElement("input"),
    //         React.createElement(
    //             "p",
    //             null,
    //             new Date().toString()
    //         )
    //     )
    // )

    root.render(
        <React.Fragment>
            <Demo />
            <Demo />
            <Demo />
            <Demo />
        </React.Fragment>
    )

}

setInterval(update, 1000);
