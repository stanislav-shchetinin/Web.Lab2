// const saveTable = (): void => {
//     localStorage.setItem(
//         "table",
//         document.querySelector(".table-hits").innerHTML,
//     );
// };

const clearTable = (): void => {
    let xhr: XMLHttpRequest = new XMLHttpRequest();
    xhr.open(
        "DELETE",
        "./controller"
    );
    xhr.send();
    const table: Element = document.querySelector(".table-hits");
    table.innerHTML = `
        <tr>
            <th>X</th>
            <th>Y</th>
            <th>R</th>
            <th>Успех?</th>
            <th>Время работы</th>
        </tr>
    `
};

const responseHandler = (response: string): void => {
    console.log(response)
    //let data = JSON.parse(response);
    const table: Element = document.querySelector(".table-hits");
    table.innerHTML = response;
    document.querySelector(".table-hits").scrollIntoView({
        behavior: "smooth",
        block: "start",
    });
    // saveTable();
};