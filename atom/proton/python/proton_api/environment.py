import enum


class Environment(enum.Enum):
    SANDBOX = "https://sandbox.hydrogenplatform.com/proton/v1"
    PRODUCTION = "https://api.hydrogenplatform.com/proton/v1"
