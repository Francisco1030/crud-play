package controllers;

import akka.stream.javadsl.Flow;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import models.entidades.MyWebSocketActor;
import play.libs.streams.ActorFlow;
import play.mvc.*;
import akka.actor.*;
import akka.stream.*;
import javax.inject.Inject;

public class HomeController extends Controller {

    private final ActorSystem actorSystem;
    private final Materializer materializer;

    @Inject
    public HomeController(ActorSystem actorSystem, Materializer materializer) {
        this.actorSystem = actorSystem;
        this.materializer = materializer;
    }

    public WebSocket socket() {
        return WebSocket.Text.accept(
                request -> {
                    // Log events to the console
                    Sink<String, ?> in = Sink.foreach(System.out::println);

                    // Send a single 'Hello!' message and then leave the socket open
                    Source<String, ?> out = Source.single("Hello!").concat(Source.maybe());

                    return Flow.fromSinkAndSource(in, out);
                });
    }

    public Result index() {
        return ok(views.html.index.render());
    }

}
