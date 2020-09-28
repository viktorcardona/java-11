module co.demo.greeterserver.en {
    requires co.demo.greeterserver;

    provides co.demo.greeterserver.GreeterServer
            with co.demo.greeterserver.en.EnGreeterServer;

}