package ru.cwcode.mtfporting.adapter;

import net.kyori.adventure.text.Component;

public interface TextAdapter {
  Component serialize(String st);
  String deserialize(Component component);
}
