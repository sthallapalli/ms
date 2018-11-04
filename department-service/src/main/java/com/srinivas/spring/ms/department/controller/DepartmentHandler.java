package com.srinivas.spring.ms.department.controller;

import com.srinivas.spring.ms.department.model.Department;
import com.srinivas.spring.ms.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.net.URI;

@Component
public class DepartmentHandler {

    @Autowired
    private DepartmentService departmentService;

    public Mono<ServerResponse> getAll(ServerRequest req) {
        return ServerResponse.ok().body(this.departmentService.getAll(), Department.class);
    }

    public Mono<ServerResponse> create(ServerRequest req) {
        return req.bodyToMono(Department.class)
                .flatMap(dept -> this.departmentService.create(dept))
                .flatMap(p -> ServerResponse.created(URI.create("/department/" + p.getId())).build());
    }

    public Mono<ServerResponse> get(ServerRequest req) {
        Mono<Department> dept = this.departmentService.get(Long.valueOf(req.pathVariable("id")));
        return ServerResponse.ok().body(dept, Department.class).switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> delete(ServerRequest req) {
        return ServerResponse.noContent().build(this.departmentService.delete(Long.valueOf(req.pathVariable("id"))));
    }



    public Mono<ServerResponse> update(ServerRequest req) {

        return ServerResponse.noContent().build();
        /*
        return Mono
                .zip(
                        (data) -> {
                            Post p = (Post) data[0];
                            Post p2 = (Post) data[1];
                            p.setTitle(p2.getTitle());
                            p.setContent(p2.getContent());
                            return p;
                        },
                        this.posts.findById(req.pathVariable("id")),
                        req.bodyToMono(Post.class)
                )
                .cast(Post.class)
                .flatMap(post -> this.posts.save(post))
                .flatMap(post -> ServerResponse.noContent().build());*/

    }
}
