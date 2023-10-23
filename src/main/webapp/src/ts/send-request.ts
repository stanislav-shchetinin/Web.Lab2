const sendRequest = (): void => {
  const valid: string = validation();
  if (valid !== "OK") {
    alert("Validation Error");
  } else {
    const btnX: NodeListOf<HTMLInputElement> =
      document.querySelectorAll(".radio-x");
    const inputY: HTMLInputElement = document.querySelector(".input-text");
    const selectorR: HTMLInputElement = document.querySelector(".r-select");

    const checkedRadio = () => {
      let res: string;
      btnX.forEach((item: HTMLInputElement): void => {
        if (item.checked) {
          res = item.value;
        }
      });
      return res;
    };

    function formatParams(params: { X: string; Y: string; R: string }): string {
      return (
        "?" +
        Object.keys(params)
          .map(function (key) {
            return key + "=" + encodeURIComponent(params[key]);
          })
          .join("&")
      );
    }

    const params: { X: string; Y: string; R: string } = {
      X: checkedRadio(),
      Y: inputY.value,
      R: selectorR.value,
    };

    let xhr: XMLHttpRequest = new XMLHttpRequest();
    xhr.open(
      "GET",
      "./controller" +
        formatParams(params),
    );

    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send();

    xhr.onload = function () {
      if (xhr.status != 200) {
        alert(`Ошибка ${xhr.status}`);
      } else {
        responseHandler(xhr.responseText);
      }
    }
  }
};
