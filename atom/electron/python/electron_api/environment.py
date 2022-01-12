import enum


class Environment(enum.Enum):
    SANDBOX = "https://sandbox.hydrogenplatform.com/electron/v1"
    PRODUCTION = "https://api.hydrogenplatform.com/electron/v1"
