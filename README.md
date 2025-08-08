# Gradle-Tutorial
This is Gradle tutorial for reference and also helpful for revision

### setup of basic gradle 

## 🔨 Build the Project

From the project root:

**Windows (Command Prompt or PowerShell):**

```text
gradlew.bat clean build
```

If you are doing for the first time
```text
gradlew.bat build
```


**Mac/Linux:**

```text
./gradlew clean build
```

This will create the JAR file inside:

```
build/libs/
```

**Default Output:**

```
build/libs/MyGradleProject1-1.0-SNAPSHOT.jar
```

---

## ▶️ Run the JAR

Run the application using:

```text
java -jar build/libs/MyGradleProject1-1.0-SNAPSHOT.jar
```

---

## 📂 Project Structure

```
MyGradleProject1/
│
├── src/
│   ├── main/
│   │   ├── java/           # Java source code
│   │   └── resources/      # Resources/config files
│
├── build.gradle            # Gradle build configuration
├── settings.gradle         # Project settings
├── gradlew / gradlew.bat   # Gradle wrapper scripts
├── gradle/                 # Gradle wrapper files
└── README.md               # Project documentation
```

---

## ⚙️ Configure the Main Class

Ensure your `build.gradle` specifies the entry point:

```gradle
jar {
    manifest {
        attributes(
            'Main-Class': 'org.example.Main'
        )
    }
    archiveBaseName = 'Main'   // Optional: rename jar
    archiveVersion = ''        // Optional: remove version
}
```

---

## 📝 Notes

* **Gradle Wrapper** lets you build without installing Gradle separately.

---
