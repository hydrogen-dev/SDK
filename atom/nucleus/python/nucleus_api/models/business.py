# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class Business(object):
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
        'address': 'list[BusinessAddress]',
        'category': 'str',
        'create_date': 'datetime',
        'dba_name': 'str',
        'email': 'str',
        'id': 'str',
        'identification_number': 'str',
        'identification_number_type': 'str',
        'incorporation_country': 'str',
        'incorporation_date': 'date',
        'incorporation_state': 'str',
        'is_active': 'bool',
        'is_public': 'bool',
        'is_verified': 'bool',
        'legal_name': 'str',
        'legal_structure': 'str',
        'metadata': 'dict(str, str)',
        'ownership': 'list[Ownership]',
        'phone_number': 'str',
        'secondary_id': 'str',
        'status': 'str',
        'subcategory': 'str',
        'ticker': 'str',
        'update_date': 'datetime',
        'website': 'str'
    }

    attribute_map = {
        'address': 'address',
        'category': 'category',
        'create_date': 'create_date',
        'dba_name': 'dba_name',
        'email': 'email',
        'id': 'id',
        'identification_number': 'identification_number',
        'identification_number_type': 'identification_number_type',
        'incorporation_country': 'incorporation_country',
        'incorporation_date': 'incorporation_date',
        'incorporation_state': 'incorporation_state',
        'is_active': 'is_active',
        'is_public': 'is_public',
        'is_verified': 'is_verified',
        'legal_name': 'legal_name',
        'legal_structure': 'legal_structure',
        'metadata': 'metadata',
        'ownership': 'ownership',
        'phone_number': 'phone_number',
        'secondary_id': 'secondary_id',
        'status': 'status',
        'subcategory': 'subcategory',
        'ticker': 'ticker',
        'update_date': 'update_date',
        'website': 'website'
    }

    def __init__(self, address=None, category=None, create_date=None, dba_name=None, email=None, id=None, identification_number=None, identification_number_type=None, incorporation_country=None, incorporation_date=None, incorporation_state=None, is_active=None, is_public=None, is_verified=None, legal_name=None, legal_structure=None, metadata=None, ownership=None, phone_number=None, secondary_id=None, status=None, subcategory=None, ticker=None, update_date=None, website=None, _configuration=None):  # noqa: E501
        """Business - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._address = None
        self._category = None
        self._create_date = None
        self._dba_name = None
        self._email = None
        self._id = None
        self._identification_number = None
        self._identification_number_type = None
        self._incorporation_country = None
        self._incorporation_date = None
        self._incorporation_state = None
        self._is_active = None
        self._is_public = None
        self._is_verified = None
        self._legal_name = None
        self._legal_structure = None
        self._metadata = None
        self._ownership = None
        self._phone_number = None
        self._secondary_id = None
        self._status = None
        self._subcategory = None
        self._ticker = None
        self._update_date = None
        self._website = None
        self.discriminator = None

        if address is not None:
            self.address = address
        if category is not None:
            self.category = category
        if create_date is not None:
            self.create_date = create_date
        if dba_name is not None:
            self.dba_name = dba_name
        if email is not None:
            self.email = email
        if id is not None:
            self.id = id
        if identification_number is not None:
            self.identification_number = identification_number
        if identification_number_type is not None:
            self.identification_number_type = identification_number_type
        if incorporation_country is not None:
            self.incorporation_country = incorporation_country
        if incorporation_date is not None:
            self.incorporation_date = incorporation_date
        if incorporation_state is not None:
            self.incorporation_state = incorporation_state
        if is_active is not None:
            self.is_active = is_active
        if is_public is not None:
            self.is_public = is_public
        if is_verified is not None:
            self.is_verified = is_verified
        self.legal_name = legal_name
        if legal_structure is not None:
            self.legal_structure = legal_structure
        if metadata is not None:
            self.metadata = metadata
        if ownership is not None:
            self.ownership = ownership
        if phone_number is not None:
            self.phone_number = phone_number
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if status is not None:
            self.status = status
        if subcategory is not None:
            self.subcategory = subcategory
        if ticker is not None:
            self.ticker = ticker
        if update_date is not None:
            self.update_date = update_date
        if website is not None:
            self.website = website

    @property
    def address(self):
        """Gets the address of this Business.  # noqa: E501


        :return: The address of this Business.  # noqa: E501
        :rtype: list[BusinessAddress]
        """
        return self._address

    @address.setter
    def address(self, address):
        """Sets the address of this Business.


        :param address: The address of this Business.  # noqa: E501
        :type: list[BusinessAddress]
        """

        self._address = address

    @property
    def category(self):
        """Gets the category of this Business.  # noqa: E501

        category  # noqa: E501

        :return: The category of this Business.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this Business.

        category  # noqa: E501

        :param category: The category of this Business.  # noqa: E501
        :type: str
        """

        self._category = category

    @property
    def create_date(self):
        """Gets the create_date of this Business.  # noqa: E501


        :return: The create_date of this Business.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this Business.


        :param create_date: The create_date of this Business.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def dba_name(self):
        """Gets the dba_name of this Business.  # noqa: E501

        dbaName  # noqa: E501

        :return: The dba_name of this Business.  # noqa: E501
        :rtype: str
        """
        return self._dba_name

    @dba_name.setter
    def dba_name(self, dba_name):
        """Sets the dba_name of this Business.

        dbaName  # noqa: E501

        :param dba_name: The dba_name of this Business.  # noqa: E501
        :type: str
        """

        self._dba_name = dba_name

    @property
    def email(self):
        """Gets the email of this Business.  # noqa: E501

        email  # noqa: E501

        :return: The email of this Business.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this Business.

        email  # noqa: E501

        :param email: The email of this Business.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def id(self):
        """Gets the id of this Business.  # noqa: E501


        :return: The id of this Business.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Business.


        :param id: The id of this Business.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def identification_number(self):
        """Gets the identification_number of this Business.  # noqa: E501

        identificationNumber  # noqa: E501

        :return: The identification_number of this Business.  # noqa: E501
        :rtype: str
        """
        return self._identification_number

    @identification_number.setter
    def identification_number(self, identification_number):
        """Sets the identification_number of this Business.

        identificationNumber  # noqa: E501

        :param identification_number: The identification_number of this Business.  # noqa: E501
        :type: str
        """

        self._identification_number = identification_number

    @property
    def identification_number_type(self):
        """Gets the identification_number_type of this Business.  # noqa: E501

        identificationNumberType  # noqa: E501

        :return: The identification_number_type of this Business.  # noqa: E501
        :rtype: str
        """
        return self._identification_number_type

    @identification_number_type.setter
    def identification_number_type(self, identification_number_type):
        """Sets the identification_number_type of this Business.

        identificationNumberType  # noqa: E501

        :param identification_number_type: The identification_number_type of this Business.  # noqa: E501
        :type: str
        """

        self._identification_number_type = identification_number_type

    @property
    def incorporation_country(self):
        """Gets the incorporation_country of this Business.  # noqa: E501

        incorporationCountry  # noqa: E501

        :return: The incorporation_country of this Business.  # noqa: E501
        :rtype: str
        """
        return self._incorporation_country

    @incorporation_country.setter
    def incorporation_country(self, incorporation_country):
        """Sets the incorporation_country of this Business.

        incorporationCountry  # noqa: E501

        :param incorporation_country: The incorporation_country of this Business.  # noqa: E501
        :type: str
        """

        self._incorporation_country = incorporation_country

    @property
    def incorporation_date(self):
        """Gets the incorporation_date of this Business.  # noqa: E501

        incorporationDate  # noqa: E501

        :return: The incorporation_date of this Business.  # noqa: E501
        :rtype: date
        """
        return self._incorporation_date

    @incorporation_date.setter
    def incorporation_date(self, incorporation_date):
        """Sets the incorporation_date of this Business.

        incorporationDate  # noqa: E501

        :param incorporation_date: The incorporation_date of this Business.  # noqa: E501
        :type: date
        """

        self._incorporation_date = incorporation_date

    @property
    def incorporation_state(self):
        """Gets the incorporation_state of this Business.  # noqa: E501

        incorporationState  # noqa: E501

        :return: The incorporation_state of this Business.  # noqa: E501
        :rtype: str
        """
        return self._incorporation_state

    @incorporation_state.setter
    def incorporation_state(self, incorporation_state):
        """Sets the incorporation_state of this Business.

        incorporationState  # noqa: E501

        :param incorporation_state: The incorporation_state of this Business.  # noqa: E501
        :type: str
        """

        self._incorporation_state = incorporation_state

    @property
    def is_active(self):
        """Gets the is_active of this Business.  # noqa: E501

        is_active  # noqa: E501

        :return: The is_active of this Business.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this Business.

        is_active  # noqa: E501

        :param is_active: The is_active of this Business.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def is_public(self):
        """Gets the is_public of this Business.  # noqa: E501

        is_public  # noqa: E501

        :return: The is_public of this Business.  # noqa: E501
        :rtype: bool
        """
        return self._is_public

    @is_public.setter
    def is_public(self, is_public):
        """Sets the is_public of this Business.

        is_public  # noqa: E501

        :param is_public: The is_public of this Business.  # noqa: E501
        :type: bool
        """

        self._is_public = is_public

    @property
    def is_verified(self):
        """Gets the is_verified of this Business.  # noqa: E501

        is_verified  # noqa: E501

        :return: The is_verified of this Business.  # noqa: E501
        :rtype: bool
        """
        return self._is_verified

    @is_verified.setter
    def is_verified(self, is_verified):
        """Sets the is_verified of this Business.

        is_verified  # noqa: E501

        :param is_verified: The is_verified of this Business.  # noqa: E501
        :type: bool
        """

        self._is_verified = is_verified

    @property
    def legal_name(self):
        """Gets the legal_name of this Business.  # noqa: E501

        legalName  # noqa: E501

        :return: The legal_name of this Business.  # noqa: E501
        :rtype: str
        """
        return self._legal_name

    @legal_name.setter
    def legal_name(self, legal_name):
        """Sets the legal_name of this Business.

        legalName  # noqa: E501

        :param legal_name: The legal_name of this Business.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and legal_name is None:
            raise ValueError("Invalid value for `legal_name`, must not be `None`")  # noqa: E501

        self._legal_name = legal_name

    @property
    def legal_structure(self):
        """Gets the legal_structure of this Business.  # noqa: E501

        legalStructure  # noqa: E501

        :return: The legal_structure of this Business.  # noqa: E501
        :rtype: str
        """
        return self._legal_structure

    @legal_structure.setter
    def legal_structure(self, legal_structure):
        """Sets the legal_structure of this Business.

        legalStructure  # noqa: E501

        :param legal_structure: The legal_structure of this Business.  # noqa: E501
        :type: str
        """

        self._legal_structure = legal_structure

    @property
    def metadata(self):
        """Gets the metadata of this Business.  # noqa: E501

        metadata  # noqa: E501

        :return: The metadata of this Business.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this Business.

        metadata  # noqa: E501

        :param metadata: The metadata of this Business.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def ownership(self):
        """Gets the ownership of this Business.  # noqa: E501

        ownership  # noqa: E501

        :return: The ownership of this Business.  # noqa: E501
        :rtype: list[Ownership]
        """
        return self._ownership

    @ownership.setter
    def ownership(self, ownership):
        """Sets the ownership of this Business.

        ownership  # noqa: E501

        :param ownership: The ownership of this Business.  # noqa: E501
        :type: list[Ownership]
        """

        self._ownership = ownership

    @property
    def phone_number(self):
        """Gets the phone_number of this Business.  # noqa: E501

        phoneNumber  # noqa: E501

        :return: The phone_number of this Business.  # noqa: E501
        :rtype: str
        """
        return self._phone_number

    @phone_number.setter
    def phone_number(self, phone_number):
        """Sets the phone_number of this Business.

        phoneNumber  # noqa: E501

        :param phone_number: The phone_number of this Business.  # noqa: E501
        :type: str
        """

        self._phone_number = phone_number

    @property
    def secondary_id(self):
        """Gets the secondary_id of this Business.  # noqa: E501


        :return: The secondary_id of this Business.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this Business.


        :param secondary_id: The secondary_id of this Business.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def status(self):
        """Gets the status of this Business.  # noqa: E501

        status  # noqa: E501

        :return: The status of this Business.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this Business.

        status  # noqa: E501

        :param status: The status of this Business.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def subcategory(self):
        """Gets the subcategory of this Business.  # noqa: E501

        subcategory  # noqa: E501

        :return: The subcategory of this Business.  # noqa: E501
        :rtype: str
        """
        return self._subcategory

    @subcategory.setter
    def subcategory(self, subcategory):
        """Sets the subcategory of this Business.

        subcategory  # noqa: E501

        :param subcategory: The subcategory of this Business.  # noqa: E501
        :type: str
        """

        self._subcategory = subcategory

    @property
    def ticker(self):
        """Gets the ticker of this Business.  # noqa: E501

        ticker  # noqa: E501

        :return: The ticker of this Business.  # noqa: E501
        :rtype: str
        """
        return self._ticker

    @ticker.setter
    def ticker(self, ticker):
        """Sets the ticker of this Business.

        ticker  # noqa: E501

        :param ticker: The ticker of this Business.  # noqa: E501
        :type: str
        """

        self._ticker = ticker

    @property
    def update_date(self):
        """Gets the update_date of this Business.  # noqa: E501


        :return: The update_date of this Business.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this Business.


        :param update_date: The update_date of this Business.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

    @property
    def website(self):
        """Gets the website of this Business.  # noqa: E501

        website  # noqa: E501

        :return: The website of this Business.  # noqa: E501
        :rtype: str
        """
        return self._website

    @website.setter
    def website(self, website):
        """Sets the website of this Business.

        website  # noqa: E501

        :param website: The website of this Business.  # noqa: E501
        :type: str
        """

        self._website = website

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
        if issubclass(Business, dict):
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
        if not isinstance(other, Business):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Business):
            return True

        return self.to_dict() != other.to_dict()
