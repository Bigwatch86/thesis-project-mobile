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
<img title="Запуск эмулятора" src="images/screenshots/AndroidStudio_2.jpg">

<p><i>Запущенный эмулятор выглядит следующим образом: </i>
</br>
</br>
<img title="Эмулятор реального устройства" src="images/screenshots/AndroidStudio_3.jpg">

<p><i>Далее необходимо запустить <b>Appium Server</b>: </i>
</br>
</br>
<img title="Запуск Appium" src="images/screenshots/Appium_1.jpg">

<h3>:large_blue_diamond:	 Процесс запуска тестов происходит так:</h3>

<p><i>В терминале Intelij_IDEA прописываем следующие команды, после которых запускаются тесты: </i>

```
gradle clean test
```
<p><i>Для отправки отчета в Телеграм, прописываем следующие команды: </i>

```
java  \
"-DprojectName=Local run" \
"-Denv=Testing" \
"-DreportLink=No link" \
"-Dcomm=Any comment here" \
"-Dconfig.file=./notifications/telegram_config_local.json" \
-jar ./notifications/allure-notifications-3.1.2.jar
```

<h2>:bar_chart:	 Отчет о результатах прохождения тестов в Allure TestOps</h2>

<h4>:small_orange_diamond:	 Страница с результатами пройденных проверок:</h4>

<p align="center">
<img title="Test results" src="images/screenshots/AllureReport_1.jpg">
</p>

<h4>:small_orange_diamond:	 Страница с результатами пройденных проверок, если есть оишбки:</h4>

<p align="center">
<img title="Test results with bug" src="images/screenshots/AllureReport_2.jpg">
</p>

<h4>:small_orange_diamond:	 Страница с общими результатами тестирования в графическом виде:</h4>

<p align="center">
<img title="Allure Graphs" src="images/screenshots/AllureReport_3.jpg">
</p>


<h2>:mailbox_with_mail:	 Уведомления в Telegram с использованием бота</h2>
<p><i>После окончания работы скрипта в Телеграм отправляется уведомление с результатами. </i>
</br>
</br>
<img title="Telegram notification" src="images/screenshots/Telegram_message.jpg">
</p>
