// const saveTable = (): void => {
//     localStorage.setItem(
//         "table",
//         document.querySelector(".table-hits").innerHTML,
//     );
// };

// const clearTable = (): void => {
//     let table: Element = document.querySelector(".table-hits");
//     table.innerHTML = `
//             <tr>
//                 <th>X</th>
//                 <th>Y</th>
//                 <th>R</th>
//                 <th>Успех?</th>
//                 <th>Время работы</th>
//             </tr>
//         `;
//     saveTable();
// };

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