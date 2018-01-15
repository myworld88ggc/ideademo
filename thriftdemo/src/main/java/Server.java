import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.server.TThreadPoolServer.Args;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import test.Hello;
import test.Impl.HelloImpl;

/**
 * Created by gao.guangcai on 2017-11-10.
 */
public class Server {
    @SuppressWarnings({"rawtypes", "unchecked" })
    public void startServer() {
        try {
            System.out.println("thrift server host on port 8899");
            TServerSocket serverTransport = new TServerSocket(8899);
            Hello.Processor process = new Hello.Processor(new HelloImpl());
            TBinaryProtocol.Factory portFactory = new TBinaryProtocol.Factory(true, true);
            Args args = new Args(serverTransport);
            args.processor(process);
            args.protocolFactory(portFactory);
            TServer server = new TThreadPoolServer(args);
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("thrift server init");
        Server server = new Server();
        System.out.println("thrift server start");
        server.startServer();
        System.out.println("thrift server end");
    }
}


