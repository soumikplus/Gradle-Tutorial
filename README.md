# Gradle-Tutorial
This is Gradle tutorial for reference and also helpful for revision

### Setup of basic gradle 
```text
gradle init --use-defaults --type java-application
```
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
The below command creates a new jar file in ```build/libs``` folder
```text
./gradlew jar
```

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


## 📝 Notes

* **Gradle Wrapper** lets you build without installing Gradle separately.

---
