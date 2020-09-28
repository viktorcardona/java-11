module co.demo.greeterserver.nl {
    requires co.demo.greeterserver;

    provides co.demo.greeterserver.GreeterServer
            with co.demo.greeterserver.nl.NlGreeterServer;

}