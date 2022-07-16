Что нужно сделать, чтобы сделать jar исполняемым:
    1. Для всех зависимостей нужно вызвать фазу install и загрузить наши зависимости в локальный репозиторий
    (из root можно выхвать install);
    2. В ресурсах создать пакет META-INF и создаем там файл MANIFEST.MF;
    3. Тут нужно указать Main-Class. Обязательно ниже пустая строка;
    4. Переопределить в POM this.проекта maven-jar-plugin и указать и тут, где лежит main метод;
    5. java -jar target/starter-1.0-SNAPSHOT.jar - работает.

ЭТО не работает с зависимостями других модулей. Поэтому:

Вариант 1 - перепишем все зависимости в папку lib в target
    1. Переопределяем maven-dependency-plugin и говорим ему выполнить goal copy-dependencies на фазе prepare-package
        в пакет ${project.build.directory}/lib;
    2. Теперь в плагине maven-jar-plugin устанавливаем:
        <addClasspath>true</addClasspath>
        <classpathPrefix>lib/</classpathPrefix>

Вариант 2 - будет исполняемая jar содержащая в себе все зависимости
    1. Переопределим плагин maven-assembly-plugin и говорим ему выполнить goal single на фазе package;
    2. Указываем в archive manifest <mainClass>starter.UserStarter</mainClass>
    3. Добавляем дескриптор, который расскажет КАК это распаковывать
          <descriptorRefs>jar-with-dependencies</descriptorRefs>



