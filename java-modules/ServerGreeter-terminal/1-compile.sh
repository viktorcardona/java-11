export JAVAFX_MODS_PATH=../../../../../../../../software/javafx-jmods-11.0.2
javac --module-source-path src -d out $(find . -name '*.java') --module-path $JAVAFX_MODS_PATH
cp src/co.demo.greeterserver.application/GreeterGUI.fxml out/co.demo.greeterserver.application/GreeterGUI.fxml