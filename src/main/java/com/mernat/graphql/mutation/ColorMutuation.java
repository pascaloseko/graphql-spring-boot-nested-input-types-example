package com.mernat.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mernat.graphql.dao.entity.Color;
import com.mernat.graphql.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ColorMutuation implements GraphQLMutationResolver {

    @Autowired
    private GlobalService globalService;

    public Color createColor(final String name) {
        return this.globalService.createColor(name);
    }
}