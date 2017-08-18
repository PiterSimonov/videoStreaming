package ck.simonov.videostreaming.services;

import ck.simonov.videostreaming.grpc.Answer;
import ck.simonov.videostreaming.grpc.Hello;
import ck.simonov.videostreaming.grpc.TestServiceGrpc;
import io.grpc.stub.StreamObserver;

public class TestService extends TestServiceGrpc.TestServiceImplBase {
    @Override
    public void sayHello(Hello request, StreamObserver<Answer> responseObserver) {
        int id = request.getId();

        responseObserver.onNext(Answer.newBuilder().setMessage("Hello").build());
        responseObserver.onCompleted();
    }
}
