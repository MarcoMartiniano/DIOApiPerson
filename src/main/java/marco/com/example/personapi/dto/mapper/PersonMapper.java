package marco.com.example.personapi.dto.mapper;


import marco.com.example.personapi.dto.request.PersonDTO;
import marco.com.example.personapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);
    PersonDTO toDTO(Person dto);
}
