class ClienteTest {

    @Test
    void deveArmazenarEstados() {
        Cliente Cliente = new Cliente();
        Cliente.setEstado(ClienteEstadoMatriculado.getInstance());
        Cliente.setEstado(ClienteEstadoFormado.getInstance());
        assertEquals(2, Cliente.getEstados().size());
    }