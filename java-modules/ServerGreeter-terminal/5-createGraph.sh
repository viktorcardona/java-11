# Generate Module Graph
export JAVAFX_LIB_PATH=../../../../../../../../software/javafx-sdk-11.0.2/lib
jdeps --module-path $JAVAFX_LIB_PATH:jars -recursive --dot-output dots jars/GreeterServerApp.jar
# copy the contents of the file dots/summary.dot
# go to:
# www.webgraphviz.com
# paste the content into the field text box
# click the button Generate Graph!
# The grap is generated!