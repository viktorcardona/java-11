# need to use javafx mods path
export JAVAFX_MODS_PATH=../../../../../../../../software/javafx-jmods-11.0.2
# the options that allows to compress (reduce size) the generated JRE:
# 	--compress 2
# 	--no-header-files
# 	--no-man-pages
$JAVA_HOME/bin/jlink     \
      --module-path $JAVA_HOME/jmods:$JAVAFX_MODS_PATH:out \
      --add-modules javafx.controls,javafx.fxml,javafx.graphics,co.demo.greeterserver,co.demo.greeterserver.application,co.demo.greeterserver.en,co.demo.greeterserver.es,co.demo.greeterserver.nl \
      --launcher GREETER=co.demo.greeterserver.application/co.demo.greeterserver.application.Main  \
      --output jre \
      --compress 2 \
      --no-header-files \
      --no-man-pages