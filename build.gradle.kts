plugins{
    java;
    id("com.dorongold.task-tree") version "3.0.0"
}
tasks.named<Jar>("jar"){
    manifest{
        attributes["Main-Class"]="com.gradlehero.languageapp.SayHello"
    }


}
tasks.named<Test>("test"){
    useJUnitPlatform()
}
dependencies{
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")

}
repositories{
    mavenCentral()
}