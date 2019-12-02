package me.jzero2.mapstruct_demo.person;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonMapperTest {

    @Test
    @DisplayName("personToPersonDtoMapping")
    public void personToPersonDtoMappingTest() {
        PersonMapper mapper = new PersonMapperImpl();
        Person person = new Person();
        person.setId(1L);
        person.setName("jzero2");
        PersonDto dto = mapper.personToPersonDto(person);
        assertThat(dto.getFullName()).isEqualTo(person.getName());
        assertThat(dto.getId()).isEqualTo(person.getId());
    }

    @Test
    @DisplayName("personDtoToPersonMapping")
    public void personDtoToPersonMappingTest() {
        PersonDto dto = new PersonDto();
        dto.setId(1L);
        dto.setFullName("juyoung");

        PersonMapper mapper = new PersonMapperImpl();
        Person person = mapper.pesonDtoToPerson(dto);
        assertThat(person.getName()).isEqualTo(dto.getFullName());
        assertThat(person.getId()).isEqualTo(dto.getId());
    }
}
