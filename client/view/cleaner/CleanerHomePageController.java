package client.view.cleaner;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.view.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;


public class CleanerHomePageController implements ViewController {

    @FXML private ListView<HBox> roomToBeClean;
    private CleanerHomePageViewModel cleanerHomePageViewModel;

    @Override
    public void init(ViewHandler vh, ViewModelFactory vmf) {
        cleanerHomePageViewModel = vmf.getCleanerHomePageViewModel();
        loadRooms();
    }

    private void loadRooms()
    {
        cleanerHomePageViewModel.loadRooms(false);
        roomToBeClean.setItems(cleanerHomePageViewModel.getRoomList());
    }

    @FXML
    public void refreshList(MouseEvent mouseEvent) {
        loadRooms();
    }
}
