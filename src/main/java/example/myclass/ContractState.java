package example.myclass;

import java.sql.Timestamp;

public class ContractState {
    private String contractName;
    private String contractState;
    private Timestamp endTime;

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractState() {
        return contractState;
    }

    public void setContractState(String contractState) {
        this.contractState = contractState;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
}
