<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
            href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap"
            rel="stylesheet"
    />
    <link rel="stylesheet" href="css/style.css" />

    <script src="out/js/main.js" defer></script>
    <script src="out/js/send-request.js" defer></script>
    <script src="out/js/validation.js?c=26234g2g22rh14h34" defer></script>
    <script src="out/js/table-update.js" defer></script>

    <title>Lab1</title>
</head>
<body>
<header class="header">
    <div class="header-content">
        <a href="https://t.me/private_stasik" data-aos="fade-down">
            <img src="img/cat-logo.jpg" alt="cat-logo" class="cat-logo" />
        </a>

        <a href="index.jsp" class="item-link" data-aos="fade-down">Lab1</a>

        <div class="dropdown" data-aos="fade-down">
            <a href="#" class="fa item-link" data-aos="fade-down">Info</a>

            <ul class="submenu">
                <li class="item">
                    <a
                            href="https://github.com/stanislav-shchetinin"
                            target="_blank"
                            class="item-link"
                    >Щетинин С.В.</a
                    >
                </li>
                <li class="item">
                    <a
                            href="https://docs.google.com/spreadsheets/d/1quq4LCK7EXYgNiAnbCFnsg54IUDDKf5Ei-4Fn-CuVuk/edit#gid=798351758"
                            class="item-link"
                            target="_blank"
                    >Группа: P3208</a
                    >
                </li>
                <li class="item">
                    <a
                            href="https://se.ifmo.ru/courses/web?t=1"
                            target="_blank"
                            class="item-link"
                    >Вариант: 1826</a
                    >
                </li>
            </ul>
        </div>
    </div>
</header>
<section class="heading">
    <h1 class="title" data-aos="fade-up" data-aos-delay="500">
        Лабораторная работа №1
    </h1>
    <p class="description" data-aos="fade-up" data-aos-delay="900">
        Разработать PHP-скрипт, определяющий попадание точки на координатной
        плоскости в заданную область
    </p>
</section>
<img
        src="img/pepe.gif"
        alt="gif"
        class="gif"
        data-aos="zoom-in"
        data-aos-delay="500"
/>
<img
        src="img/graph.webp"
        alt="graph"
        class="gif"
        data-aos="fade-right"
        data-aos-delay="300"
/>
<main class="main" data-aos="fade-left" data-aos-delay="100">
    <div class="input-form">
        <p>X:</p>
        <fieldset>
            <div class="radio-btn">
                <label for="contactChoice1">
                    <input
                            type="radio"
                            name="X"
                            value="-5"
                            id="contactChoice1"
                            class="radio-x"
                            checked
                    />
                    <span>-5</span>
                </label>

                <label for="contactChoice2">
                    <input
                            type="radio"
                            name="X"
                            value="-4"
                            id="contactChoice2"
                            class="radio-x"
                    />
                    <span>-4</span>
                </label>

                <label for="contactChoice3">
                    <input
                            type="radio"
                            name="X"
                            value="-3"
                            id="contactChoice3"
                            class="radio-x"
                    />
                    <span>-3</span>
                </label>

                <label for="contactChoice4">
                    <input
                            type="radio"
                            name="X"
                            value="-2"
                            id="contactChoice4"
                            class="radio-x"
                    />
                    <span>-2</span>
                </label>

                <label for="contactChoice5">
                    <input
                            type="radio"
                            name="X"
                            value="-1"
                            id="contactChoice5"
                            class="radio-x"
                    />
                    <span>-1</span>
                </label>

                <label for="contactChoice6">
                    <input
                            type="radio"
                            name="X"
                            value="0"
                            id="contactChoice6"
                            class="radio-x"
                    />
                    <span>0</span>
                </label>

                <label for="contactChoice7">
                    <input
                            type="radio"
                            name="X"
                            value="1"
                            id="contactChoice7"
                            class="radio-x"
                    />
                    <span>1</span>
                </label>

                <label for="contactChoice8">
                    <input
                            type="radio"
                            name="X"
                            value="2"
                            id="contactChoice8"
                            class="radio-x"
                    />
                    <span>2</span>
                </label>

                <label for="contactChoice9">
                    <input
                            type="radio"
                            name="X"
                            value="3"
                            id="contactChoice9"
                            class="radio-x"
                    />
                    <span>3</span>
                </label>

                <label for="contactChoice10">
                    <input
                            type="radio"
                            name="X"
                            value="4"
                            id="contactChoice10"
                            class="radio-x"
                    />
                    <span>4</span>
                </label>

                <label for="contactChoice11">
                    <input
                            type="radio"
                            name="X"
                            value="5"
                            id="contactChoice11"
                            class="radio-x"
                    />
                    <span>5</span>
                </label>
            </div>
        </fieldset>

        <p>Y:</p>
        <input name="Y" type="text" class="input-text" placeholder="-3..3" />

        <select name="R" class="r-select">
            <option value="" selected disabled hidden>R:</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select>

        <button onclick="sendRequest()" class="btn-send-form btn">
            Отправить!
        </button>
    </div>
</main>
<div class="header-table" data-aos="fade-down">
    <h2 class="name-table">Таблица попаданий</h2>
    <button class="btn-clear-table btn" onclick="clearTable()">Очистить таблицу</button>
</div>
<div class="wrapper-table-hits" data-aos="fade-up">
    <table class="table-hits">
        <tr>
            <th>X</th>
            <th>Y</th>
            <th>R</th>
            <th>Успех?</th>
            <th>Время работы</th>
        </tr>
    </table>
</div>
</body>
</html>
