plugins{
    java
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