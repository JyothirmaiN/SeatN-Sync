package.com.infosys.seatsync.controller;

@RestController
@RequestMapping("infy/dc")  
public class DCDeailsController{
  private final DCDetailsService dcDetailsService;
  
    public DCDetailsController(DCDetailsService dcDetailsService) {
        this.dcDetailsService = dcDetailsService;
    }

    @GetMapping("/details")
    public ResponseEntity<DCInfoResponseDto> getAllDCInfo(){
        return new ResponseEntity<>(dcDetailsService.getAllDCInfo(), HttpStatus.OK);
    }



}
