import enum


class Environment(enum.Enum):
    SANDBOX = "https://sandbox.hydrogenplatform.com/integration/v1"
    PRODUCTION = "https://api.hydrogenplatform.com/integration/v1"
