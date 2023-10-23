//Проверка на принадлежность числа дипозону [-3; 3]
const regRange: RegExp = /^-?(?:3(?:\.0+)?|[0-2](?:\.[0-9]+)?|\.[0-9]+)$/;
const notInRange: string = "Значение Y должно быть от -3 до 3 (дробные значения вводите через точку, например, 2.9)";
const notSelectedR: string = "Не выбран R";
const noErrors: string = "OK";
const checkInputY = (inputY: HTMLInputElement): boolean => {
  let y: string = inputY.value.replace(",", ".");
  let regex: RegExp = new RegExp(regRange);
  return regex.test(y.toString());
};
const checkSelectorR = (selectorR: HTMLInputElement): boolean => {
  return selectorR.value !== "";
};
const validation = (): string => {
  const inputY: HTMLInputElement = document.querySelector(".input-text");
  const selectorR: HTMLInputElement = document.querySelector(".r-select");

  if (!checkInputY(inputY)) {
    return notInRange;
  } else if (!checkSelectorR(selectorR)) {
    return notSelectedR;
  } else {
    return noErrors;
  }
};
