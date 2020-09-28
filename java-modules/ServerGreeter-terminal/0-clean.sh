rm -rf dots/*
if [ -d "dots" ]; then
  rm -r dots
fi

rm -rf out/*
if [ -d "out" ]; then
  rm -r out
fi

rm -rf jars/*
if [ -d "jars" ]; then
  rm -r jars
fi

rm -rf jre/*
if [ -d "jre" ]; then
  rm -r jre
fi