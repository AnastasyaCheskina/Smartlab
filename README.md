# Мобильное приложение Smartlab
[![Логотип](https://i.postimg.cc/QtgdgTfM/image.png)](https://postimg.cc/YG97MhKc "Логотип приложения")

## Описание проекта
**Smartlab** - это мобильное приложение для удобного взаимодействия с медицинской клиникой. С помощью этого приложения, такие действия как *запись ко врачу, сдача анализов*, станут намного **проще**. Вы можете быстро и просто зарегестрироваться в приложении и Ваши данные никогда не будут утеряны. Больше не нужно стоять в очереди в регистратуре поликлиники, чтобы получить свою медицинскую карту - все сведения всегда будут у Вас под рукой! Система оповещений напомнит Вам о приближающемся приеме в клинике, и Вы не забудете посетить врача в назначенное время. Данное приложение подходит *только для Android*.</br>
**На данный момент приложение находится в стадии разработки.**

## Обзор приложения
В данный момент времени приложение находится на стадии разработки, но уже включает в себя следующий функционал:
+ **Загрузочный экран** </br>
  Загрузочный экран встречает пользователя при каждом открытии приложения.</br>
  [![Загрузочный экран](https://i.postimg.cc/QdZLrdsQ/image.png)](https://postimg.cc/Tp0NVGK1 "Загрузочный экран") </br>
  После загрузки пользователь автоматически перенаправляется на экран "Знакомство с приложением".
+ **Знакомство с приложением** </br>
  На данном экране реализован свайп изображений, что позволяет быстро ознакомиться с приложением. Если пользователь не хочет кратко ознакомиться, то он может пропустить это, нажав на одноименную кнопку в правом верхнем углу, и перейти на страницу "Регистрация".</br>
  [![Знакомство с приложением](https://i.postimg.cc/6qRhtwLS/image.png)](https://postimg.cc/YLrFz5Pf "Знакомство с приложением")
+ **Регистрация** </br>
  На странице регистрации пользователю необходимо ввести свой e-mail адрес и нажать на кнопку "Далее". При корректном заполнении поля ввода (маска ввода почты: "example@mail.ru") кнопка "Далее" станет активной и изменит свой цвет.</br>
  Функция regexMatch(str) осуществляет проверку строки str на соответствие маске ввода.
```kotlin
private fun regexMatch(str: String): Boolean {
        val regex = "^\\S+@\\S+\\.\\S+\$".toRegex()
        return regex.matches(str)
    }
```
  При нажатии на кнопку "Далее" будет реализован переход на следующий экран "Подтверждение кода из E-mail". Если же поле заполнено некорректно, то пользователь не сможет перейти далее, а граница поля ввода станет подсвечена красным цветом.</br>
  [![image.png](https://i.postimg.cc/qR16C74S/image.png)](https://postimg.cc/47hxDsKQ)</br>
  
  
+ **Подтверждение кода из E-mail** </br>
  Данный экран позволяет пользователю ввести код, полученный на указанный ранее e-mail адрес. В случае совпадения введенного пользователем кода с отправленным ему на почту, пользователь будет перенаправлен на страницу "Создание карты пациента" (данный функционал в стадии разработки). Также на странице идет обратный отсчет времени, по истечении которого можно отправить код повторно. Реализован функционал автоматического перехода к следующему полю ввода числа.</br>
  [![Код из E-mail](https://i.postimg.cc/sfNp0By2/image.png)](https://postimg.cc/Dm1JSwSV "Код из E-mail")</br>
  Функционал отправки и проверки кода с почты будет реализован с использованием API.
+ **Создание карты пациента** </br>
  Создание карты пациента можно пропустить, нажав на одноименную кнопку в правом верхнем углу страницы. Кнопка "Далее" станет активной и изменит цвет только в случае заполненности всех представленных на странице полей. На данный момент страница находится в стадии разработки.</br>
  [![Создание карты пациента](https://i.postimg.cc/5NmCvpgD/image.png)](https://postimg.cc/4mmyR6r1 "Создание карты пациента")
+ **Главная страница** </br>
  Информация на главной странице подгружается с API. На данный момент страница создана, подгружаются данные о каталоге товаров (анализов) клиники, также реализована навигационная панель внизу страницы (можно осуществить переход в личный кабинет пользователя). Страница находится в стадии разработки.
+ **Личный кабинет** </br>
  Личный кабинет представляет пользователю возможность отображения и редактирования своих личных данных. Также предусмотрена загрузка фотографии пользователя из хранилища устройства. Также внизу страницы есть панель навигации, с которой можно осуществить переход на главную страницу. На данный момент страница поддерживает только загрузку и отображение фотографии, остальной функционал находится в процессе разработки.</br>
  [![Личный кабинет](https://i.postimg.cc/506tHSyd/image.png)](https://postimg.cc/xJVQhHLt "Личный кабинет")
## Используемые технологии
Данное приложение создано при помощи:
1. Языка разметки **XAML**
2. Языка программирования **Kotlin**
3. Данные в приложении выгружаются из [API](https://iis.ngknn.ru/NGKNN/%D0%9C%D0%B0%D0%BC%D1%88%D0%B5%D0%B2%D0%B0%D0%AE%D0%A1/MedicMadlab/ "Ссылка на API")
4. Дизайн приложения разработан в соответствии с [макетом Figma](https://www.figma.com/files/recents-and-sharing/recently-viewed?fuid=1080409112646483635 "Ссылка на макет Figma")

## Установка приложения
Для того, чтобы опробовать приложение в действии, необходимо склонировать проект с данного репозитория в **Android Studio**. 
## Информация о разработке
Данное приложение разрабатывается в рамках учебного задания по мобильной разработке. При реализации использовались сторонние ресурсы и [следующий проект на GitHub](https://github.com/Julia-Mamsheva/Example_Connection_Api "Ссылка на проект GitHub")
