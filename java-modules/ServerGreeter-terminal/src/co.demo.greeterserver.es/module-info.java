module co.demo.greeterserver.es {
    requires co.demo.greeterserver;

    provides co.demo.greeterserver.GreeterServer
            with co.demo.greeterserver.es.EsGreeterServer;

}