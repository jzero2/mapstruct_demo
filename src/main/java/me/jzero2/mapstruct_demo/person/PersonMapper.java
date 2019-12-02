package me.jzero2.mapstruct_demo.person;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(source = "name", target = "fullName")
    PersonDto personToPersonDto(Person person);

    @Mapping(source = "fullName", target = "name")
    Person pesonDtoToPerson(PersonDto dto);
}
