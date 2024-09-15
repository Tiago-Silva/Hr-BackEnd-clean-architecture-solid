package br.com.hrbackend.application.usecases;

public interface UseCase<InputDTO, OutputDTO> {
    OutputDTO execute(InputDTO inputDTO);
}
