<h1>Проект по тестированию мобильного приложения Wikipedia.</h1>

<h2>:bookmark_tabs: Содержание</h2>

:eight_spoked_asterisk:	 Реализованные проверки

:eight_spoked_asterisk:	 Стек технологий

:eight_spoked_asterisk:	 Подготовка окружения и запуск тестов

:eight_spoked_asterisk:	 Отчет о результатах прохождения тестов в Allure Report

:eight_spoked_asterisk:	 Уведомления в Telegram с использованием бота

<h2>:eyes:	 Реализованные проверки</h2>

:black_medium_square: Проверка загрузки страниц ознакомления

:black_medium_square: Проверка загрузки главной страницы приложения

<h2>:books:	 Стек технологий</h2>


<p>
<img title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg" height="48" width="48">
<img title="GitHub" src="images/logo/GitHub.svg" height="48" width="48">
<img title="Java" src="images/logo/Java.svg" height="48" width="48">
<img title="Gradle" src="images/logo/Gradle.svg" height="48" width="48">
<img title="JUnit5" src="images/logo/JUnit5.svg" height="48" width="48">
<img title="Selenide" src="images/logo/Selenide.svg" height="48" width="48">
<img title="Android Studio" src="images/logo/androidstudio.png" height="48" width="48"> 
<img title="Appium Server GUI" src="images/logo/appium.png" height="48" width="48">
<img title="Allure TestOps" src="images/logo/Allure_TestOps.png" height="48" width="48">
<img title="Telegram" src="images/logo/Telegram.svg" height="48" width="48">
</p>


<h2>:arrow_forward:	 Подготовка окружения и запуск тестов</h2>
<p>Для запуска тестов используется реальное устройство или эмулятор реального устройства, запущенный с помощью <b>Android Studio</b></p>

<p><i>Чтобы запустиль эмулятор необходимо запустить Android Studio и выбрать <b>Virtual Device Manager</b>: </i>
</br>
</br>
<img title="Запуск Android Studio" src="images/screenshots/AndroidStudio_1.jpg">

<p><i>Если список устройств пуст, то необходимо создать устройство и запустить его: </i>
</br>
</br>
<img title="Запуск Android Studio" src="images/screenshots/AndroidStudio_2.jpg">

<p><i>Запущенный эмулятор выглядит следующим образом: </i>
</br>
</br>
<img title="Запуск Android Studio" src="images/screenshots/AndroidStudio_3.jpg">

<p><i>Следующим шагом необходимо запустить <b>Appium Server</b>: </i>
</br>
</br>
<img title="Запуск Android Studio" src="images/screenshots/Appium_1.jpg">

<h3>:large_blue_diamond:	 Процесс запуска тестов происходит следующим образом:</h3>

<p><i>В терминале Intelij_IDEA ппрописываем следующие команды, после которых запускаются тесты: </i>

```
gradle clean test
```

<img title="Запуск сборки с параметрами" src="images/screenshots/Jenkins_1.jpg">
</p>

<p><i>Выбираем необходимые параметры запуска и нажимаем <b>"Собрать"</b>: </i>
</br>
</br>
<img title="Выбор параметров" src="images/screenshots/Jenkins_2.jpg">
</p>

<p><i>Результаты работы сборки можно посмотреть, нажав на значок "Allure TestOps"</b>: </i>
</br>
</br>
<img title="Просмотр результатов" src="images/screenshots/Jenkins_3.jpg">
</p>

<h2>:bar_chart:	 Отчет о результатах прохождения тестов в Allure TestOps</h2>

<h4>:small_orange_diamond:	 Страница со списком всех пройденных проверок:</h4>

<p align="center">
<img title="Test results" src="images/screenshots/Allure_TestOps_1.jpg">
</p>

<h4>:small_orange_diamond:	 Страница со всеми запусками:</h4>

<p align="center">
<img title="Allure Launches" src="images/screenshots/Allure_TestOps_2.jpg">
</p>

<h4>:small_orange_diamond:	 Дефект, описанный в результате запуска тестов:</h4>

<p align="center">
<img title="Allure Defects" src="images/screenshots/Allure_TestOps_3.jpg">
</p>

<h4>:small_orange_diamond:	 Страница с общими результатами тестирования в графическом виде:</h4>

<p align="center">
<img title="Allure Dashboards" src="images/screenshots/Allure_TestOps_4.jpg">
</p>


<h2>:mailbox_with_mail:	 Уведомления в Telegram с использованием бота</h2>
<p><i>После окончания сборки в Телеграм отправляется уведомление со ссылкой на отчёт. </i>
</br>
</br>
<img title="Telegram notification" src="images/screenshots/Telegram_message.jpg">
</p>


<h2>:cinema:	 Пример запуска теста в Selenoid</h2>
<p><i>К каждому тесту в отчете прилагается видео: </i>
</br>
</br>
<img title="Selenoid" src="images/screenshots/Selenoid.gif">
</p>
