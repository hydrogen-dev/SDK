# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.0.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from atom_api.models.address import Address  # noqa: F401,E501
from atom_api.models.client_payload import ClientPayload  # noqa: F401,E501
from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class CreateClientResponse(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'username': 'str',
        'client_type': 'str',
        'email': 'str',
        'title': 'str',
        'first_name': 'str',
        'middle_name': 'str',
        'last_name': 'str',
        'phone_number': 'str',
        'date_of_birth': 'date',
        'identification_number': 'str',
        'country_of_residence': 'str',
        'income': 'int',
        'is_verified': 'bool',
        'hydro_id': 'str',
        'is_active': 'bool',
        'address': 'list[Address]',
        'metadata': 'object',
        'secondary_id': 'SecondaryId',
        'id': 'str',
        'create_date': 'str'
    }

    attribute_map = {
        'username': 'username',
        'client_type': 'client_type',
        'email': 'email',
        'title': 'title',
        'first_name': 'first_name',
        'middle_name': 'middle_name',
        'last_name': 'last_name',
        'phone_number': 'phone_number',
        'date_of_birth': 'date_of_birth',
        'identification_number': 'identification_number',
        'country_of_residence': 'country_of_residence',
        'income': 'income',
        'is_verified': 'is_verified',
        'hydro_id': 'hydro_id',
        'is_active': 'is_active',
        'address': 'address',
        'metadata': 'metadata',
        'secondary_id': 'secondary_id',
        'id': 'id',
        'create_date': 'create_date'
    }

    def __init__(self, username=None, client_type=None, email=None, title=None, first_name=None, middle_name=None, last_name=None, phone_number=None, date_of_birth=None, identification_number=None, country_of_residence=None, income=None, is_verified=False, hydro_id=None, is_active=True, address=None, metadata=None, secondary_id=None, id=None, create_date=None):  # noqa: E501
        """CreateClientResponse - a model defined in Swagger"""  # noqa: E501

        self._username = None
        self._client_type = None
        self._email = None
        self._title = None
        self._first_name = None
        self._middle_name = None
        self._last_name = None
        self._phone_number = None
        self._date_of_birth = None
        self._identification_number = None
        self._country_of_residence = None
        self._income = None
        self._is_verified = None
        self._hydro_id = None
        self._is_active = None
        self._address = None
        self._metadata = None
        self._secondary_id = None
        self._id = None
        self._create_date = None
        self.discriminator = None

        self.username = username
        self.client_type = client_type
        if email is not None:
            self.email = email
        if title is not None:
            self.title = title
        if first_name is not None:
            self.first_name = first_name
        if middle_name is not None:
            self.middle_name = middle_name
        if last_name is not None:
            self.last_name = last_name
        if phone_number is not None:
            self.phone_number = phone_number
        if date_of_birth is not None:
            self.date_of_birth = date_of_birth
        if identification_number is not None:
            self.identification_number = identification_number
        if country_of_residence is not None:
            self.country_of_residence = country_of_residence
        if income is not None:
            self.income = income
        if is_verified is not None:
            self.is_verified = is_verified
        if hydro_id is not None:
            self.hydro_id = hydro_id
        if is_active is not None:
            self.is_active = is_active
        if address is not None:
            self.address = address
        if metadata is not None:
            self.metadata = metadata
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if id is not None:
            self.id = id
        if create_date is not None:
            self.create_date = create_date

    @property
    def username(self):
        """Gets the username of this CreateClientResponse.  # noqa: E501

        Username for the client used on the firm’s platform  # noqa: E501

        :return: The username of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this CreateClientResponse.

        Username for the client used on the firm’s platform  # noqa: E501

        :param username: The username of this CreateClientResponse.  # noqa: E501
        :type: str
        """
        if username is None:
            raise ValueError("Invalid value for `username`, must not be `None`")  # noqa: E501

        self._username = username

    @property
    def client_type(self):
        """Gets the client_type of this CreateClientResponse.  # noqa: E501


        :return: The client_type of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._client_type

    @client_type.setter
    def client_type(self, client_type):
        """Sets the client_type of this CreateClientResponse.


        :param client_type: The client_type of this CreateClientResponse.  # noqa: E501
        :type: str
        """
        if client_type is None:
            raise ValueError("Invalid value for `client_type`, must not be `None`")  # noqa: E501
        allowed_values = ["individual", "firm", "admin", "advisor"]  # noqa: E501
        if client_type not in allowed_values:
            raise ValueError(
                "Invalid value for `client_type` ({0}), must be one of {1}"  # noqa: E501
                .format(client_type, allowed_values)
            )

        self._client_type = client_type

    @property
    def email(self):
        """Gets the email of this CreateClientResponse.  # noqa: E501

        Contact email for the client in the format sample@example.com  # noqa: E501

        :return: The email of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this CreateClientResponse.

        Contact email for the client in the format sample@example.com  # noqa: E501

        :param email: The email of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def title(self):
        """Gets the title of this CreateClientResponse.  # noqa: E501

        The title of the client such as “Mr.”, “Ms.”, “Miss”, “Mx.”, etc.  # noqa: E501

        :return: The title of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this CreateClientResponse.

        The title of the client such as “Mr.”, “Ms.”, “Miss”, “Mx.”, etc.  # noqa: E501

        :param title: The title of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._title = title

    @property
    def first_name(self):
        """Gets the first_name of this CreateClientResponse.  # noqa: E501

        First name or given name of the client  # noqa: E501

        :return: The first_name of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this CreateClientResponse.

        First name or given name of the client  # noqa: E501

        :param first_name: The first_name of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._first_name = first_name

    @property
    def middle_name(self):
        """Gets the middle_name of this CreateClientResponse.  # noqa: E501

        Middle name of the client  # noqa: E501

        :return: The middle_name of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._middle_name

    @middle_name.setter
    def middle_name(self, middle_name):
        """Sets the middle_name of this CreateClientResponse.

        Middle name of the client  # noqa: E501

        :param middle_name: The middle_name of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._middle_name = middle_name

    @property
    def last_name(self):
        """Gets the last_name of this CreateClientResponse.  # noqa: E501

        Last name or surname of the client  # noqa: E501

        :return: The last_name of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """Sets the last_name of this CreateClientResponse.

        Last name or surname of the client  # noqa: E501

        :param last_name: The last_name of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._last_name = last_name

    @property
    def phone_number(self):
        """Gets the phone_number of this CreateClientResponse.  # noqa: E501

        Phone number associated with the client  # noqa: E501

        :return: The phone_number of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._phone_number

    @phone_number.setter
    def phone_number(self, phone_number):
        """Sets the phone_number of this CreateClientResponse.

        Phone number associated with the client  # noqa: E501

        :param phone_number: The phone_number of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._phone_number = phone_number

    @property
    def date_of_birth(self):
        """Gets the date_of_birth of this CreateClientResponse.  # noqa: E501

        Date of birth of the client in the ISO 8601 format YYYY-MM-DD  # noqa: E501

        :return: The date_of_birth of this CreateClientResponse.  # noqa: E501
        :rtype: date
        """
        return self._date_of_birth

    @date_of_birth.setter
    def date_of_birth(self, date_of_birth):
        """Sets the date_of_birth of this CreateClientResponse.

        Date of birth of the client in the ISO 8601 format YYYY-MM-DD  # noqa: E501

        :param date_of_birth: The date_of_birth of this CreateClientResponse.  # noqa: E501
        :type: date
        """

        self._date_of_birth = date_of_birth

    @property
    def identification_number(self):
        """Gets the identification_number of this CreateClientResponse.  # noqa: E501

        National or local identification number for a client such as Social Security Number, frequently used for Know-Your-Customer (KYC) purposes  # noqa: E501

        :return: The identification_number of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._identification_number

    @identification_number.setter
    def identification_number(self, identification_number):
        """Sets the identification_number of this CreateClientResponse.

        National or local identification number for a client such as Social Security Number, frequently used for Know-Your-Customer (KYC) purposes  # noqa: E501

        :param identification_number: The identification_number of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._identification_number = identification_number

    @property
    def country_of_residence(self):
        """Gets the country_of_residence of this CreateClientResponse.  # noqa: E501

        The country of residence of a client, often corresponding to the country issuing the identification number provided above using the ISO ALPHA-2 Code, frequently used for Know-Your-Customer (KYC) purposes  # noqa: E501

        :return: The country_of_residence of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._country_of_residence

    @country_of_residence.setter
    def country_of_residence(self, country_of_residence):
        """Sets the country_of_residence of this CreateClientResponse.

        The country of residence of a client, often corresponding to the country issuing the identification number provided above using the ISO ALPHA-2 Code, frequently used for Know-Your-Customer (KYC) purposes  # noqa: E501

        :param country_of_residence: The country_of_residence of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._country_of_residence = country_of_residence

    @property
    def income(self):
        """Gets the income of this CreateClientResponse.  # noqa: E501

        The total income for the client  # noqa: E501

        :return: The income of this CreateClientResponse.  # noqa: E501
        :rtype: int
        """
        return self._income

    @income.setter
    def income(self, income):
        """Sets the income of this CreateClientResponse.

        The total income for the client  # noqa: E501

        :param income: The income of this CreateClientResponse.  # noqa: E501
        :type: int
        """

        self._income = income

    @property
    def is_verified(self):
        """Gets the is_verified of this CreateClientResponse.  # noqa: E501

        Indicator if the identifying details provided by the client have been verified by a Know-Your-Customer (KYC) vendor. Defaults to false which indicates it is not verified  # noqa: E501

        :return: The is_verified of this CreateClientResponse.  # noqa: E501
        :rtype: bool
        """
        return self._is_verified

    @is_verified.setter
    def is_verified(self, is_verified):
        """Sets the is_verified of this CreateClientResponse.

        Indicator if the identifying details provided by the client have been verified by a Know-Your-Customer (KYC) vendor. Defaults to false which indicates it is not verified  # noqa: E501

        :param is_verified: The is_verified of this CreateClientResponse.  # noqa: E501
        :type: bool
        """

        self._is_verified = is_verified

    @property
    def hydro_id(self):
        """Gets the hydro_id of this CreateClientResponse.  # noqa: E501

        The Hydro ID associated with the client (if applicable). Corresponds to the Client Hydro entity  # noqa: E501

        :return: The hydro_id of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._hydro_id

    @hydro_id.setter
    def hydro_id(self, hydro_id):
        """Sets the hydro_id of this CreateClientResponse.

        The Hydro ID associated with the client (if applicable). Corresponds to the Client Hydro entity  # noqa: E501

        :param hydro_id: The hydro_id of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._hydro_id = hydro_id

    @property
    def is_active(self):
        """Gets the is_active of this CreateClientResponse.  # noqa: E501

        Indicates if the client is currently active. Defaults to true which indicates it is active  # noqa: E501

        :return: The is_active of this CreateClientResponse.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this CreateClientResponse.

        Indicates if the client is currently active. Defaults to true which indicates it is active  # noqa: E501

        :param is_active: The is_active of this CreateClientResponse.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def address(self):
        """Gets the address of this CreateClientResponse.  # noqa: E501


        :return: The address of this CreateClientResponse.  # noqa: E501
        :rtype: list[Address]
        """
        return self._address

    @address.setter
    def address(self, address):
        """Sets the address of this CreateClientResponse.


        :param address: The address of this CreateClientResponse.  # noqa: E501
        :type: list[Address]
        """

        self._address = address

    @property
    def metadata(self):
        """Gets the metadata of this CreateClientResponse.  # noqa: E501

        Custom information associated with the client in the format key:value  # noqa: E501

        :return: The metadata of this CreateClientResponse.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this CreateClientResponse.

        Custom information associated with the client in the format key:value  # noqa: E501

        :param metadata: The metadata of this CreateClientResponse.  # noqa: E501
        :type: object
        """

        self._metadata = metadata

    @property
    def secondary_id(self):
        """Gets the secondary_id of this CreateClientResponse.  # noqa: E501


        :return: The secondary_id of this CreateClientResponse.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this CreateClientResponse.


        :param secondary_id: The secondary_id of this CreateClientResponse.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def id(self):
        """Gets the id of this CreateClientResponse.  # noqa: E501

        ID of the client record  # noqa: E501

        :return: The id of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CreateClientResponse.

        ID of the client record  # noqa: E501

        :param id: The id of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def create_date(self):
        """Gets the create_date of this CreateClientResponse.  # noqa: E501

        Datetime the client record was created  # noqa: E501

        :return: The create_date of this CreateClientResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this CreateClientResponse.

        Datetime the client record was created  # noqa: E501

        :param create_date: The create_date of this CreateClientResponse.  # noqa: E501
        :type: str
        """

        self._create_date = create_date

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(CreateClientResponse, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, CreateClientResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
