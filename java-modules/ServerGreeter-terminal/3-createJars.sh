if [ -d "jars" ]; then
  rm -r jars
fi
mkdir jars
jar -c -f jars/GreeterServer.jar  -C out/co.demo.greeterserver .
jar -c -f jars/GreeterServerEs.jar  -C out/co.demo.greeterserver.es .
jar -c -f jars/GreeterServerEn.jar  -C out/co.demo.greeterserver.en .
jar -c -f jars/GreeterServerNl.jar  -C out/co.demo.greeterserver.nl .
jar -c -f jars/GreeterServerApp.jar --main-class co.demo.greeterserver.application.Main -C out/co.demo.greeterserver.application  .
