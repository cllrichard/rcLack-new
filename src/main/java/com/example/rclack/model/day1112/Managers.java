package com.example.rclack.model.day1112;

import java.util.ArrayList;
import java.util.List;

public class Managers extends Component {

    private List<Component> components = new ArrayList<>();


    public Managers(String position, String job) {
        super(position, job);
    }

    @Override
    void addComponent(Component component) {
        components.add(component);
    }

    @Override
    void removeComponent(Component component) {
        components.add(component);
    }

    @Override
    void check() {
        work();
        for (Component component : components) {
            component.check();
        }
    }

}
