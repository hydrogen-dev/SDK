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


class Client(object):
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
        'address': 'list[ClientAddress]',
        'authorities': 'list[str]',
        'business_id': 'str',
        'citizenship_status': 'str',
        'client_type': 'str',
        'country_of_citizenship': 'list[str]',
        'country_of_residence': 'str',
        'create_date': 'datetime',
        'date_of_birth': 'str',
        'email': 'str',
        'employment': 'Employment',
        'firm_name': 'str',
        'firm_type': 'str',
        'first_name': 'str',
        'gender': 'str',
        'group': 'list[str]',
        'hydro_id': 'str',
        'id': 'str',
        'identification_number': 'str',
        'identification_number_type': 'str',
        'image': 'str',
        'income': 'int',
        'is_active': 'bool',
        'is_verified': 'bool',
        'last_name': 'str',
        'liquid_net_worth': 'float',
        'metadata': 'dict(str, str)',
        'middle_name': 'str',
        'password': 'str',
        'phone_number': 'str',
        'secondary_id': 'str',
        'status': 'str',
        'suffix': 'str',
        'title': 'str',
        'total_net_worth': 'float',
        'update_date': 'datetime',
        'username': 'str'
    }

    attribute_map = {
        'address': 'address',
        'authorities': 'authorities',
        'business_id': 'business_id',
        'citizenship_status': 'citizenship_status',
        'client_type': 'client_type',
        'country_of_citizenship': 'country_of_citizenship',
        'country_of_residence': 'country_of_residence',
        'create_date': 'create_date',
        'date_of_birth': 'date_of_birth',
        'email': 'email',
        'employment': 'employment',
        'firm_name': 'firm_name',
        'firm_type': 'firm_type',
        'first_name': 'first_name',
        'gender': 'gender',
        'group': 'group',
        'hydro_id': 'hydro_id',
        'id': 'id',
        'identification_number': 'identification_number',
        'identification_number_type': 'identification_number_type',
        'image': 'image',
        'income': 'income',
        'is_active': 'is_active',
        'is_verified': 'is_verified',
        'last_name': 'last_name',
        'liquid_net_worth': 'liquid_net_worth',
        'metadata': 'metadata',
        'middle_name': 'middle_name',
        'password': 'password',
        'phone_number': 'phone_number',
        'secondary_id': 'secondary_id',
        'status': 'status',
        'suffix': 'suffix',
        'title': 'title',
        'total_net_worth': 'total_net_worth',
        'update_date': 'update_date',
        'username': 'username'
    }

    def __init__(self, address=None, authorities=None, business_id=None, citizenship_status=None, client_type=None, country_of_citizenship=None, country_of_residence=None, create_date=None, date_of_birth=None, email=None, employment=None, firm_name=None, firm_type=None, first_name=None, gender=None, group=None, hydro_id=None, id=None, identification_number=None, identification_number_type=None, image=None, income=None, is_active=None, is_verified=None, last_name=None, liquid_net_worth=None, metadata=None, middle_name=None, password=None, phone_number=None, secondary_id=None, status=None, suffix=None, title=None, total_net_worth=None, update_date=None, username=None, _configuration=None):  # noqa: E501
        """Client - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._address = None
        self._authorities = None
        self._business_id = None
        self._citizenship_status = None
        self._client_type = None
        self._country_of_citizenship = None
        self._country_of_residence = None
        self._create_date = None
        self._date_of_birth = None
        self._email = None
        self._employment = None
        self._firm_name = None
        self._firm_type = None
        self._first_name = None
        self._gender = None
        self._group = None
        self._hydro_id = None
        self._id = None
        self._identification_number = None
        self._identification_number_type = None
        self._image = None
        self._income = None
        self._is_active = None
        self._is_verified = None
        self._last_name = None
        self._liquid_net_worth = None
        self._metadata = None
        self._middle_name = None
        self._password = None
        self._phone_number = None
        self._secondary_id = None
        self._status = None
        self._suffix = None
        self._title = None
        self._total_net_worth = None
        self._update_date = None
        self._username = None
        self.discriminator = None

        if address is not None:
            self.address = address
        if authorities is not None:
            self.authorities = authorities
        if business_id is not None:
            self.business_id = business_id
        if citizenship_status is not None:
            self.citizenship_status = citizenship_status
        self.client_type = client_type
        if country_of_citizenship is not None:
            self.country_of_citizenship = country_of_citizenship
        if country_of_residence is not None:
            self.country_of_residence = country_of_residence
        if create_date is not None:
            self.create_date = create_date
        if date_of_birth is not None:
            self.date_of_birth = date_of_birth
        if email is not None:
            self.email = email
        if employment is not None:
            self.employment = employment
        if firm_name is not None:
            self.firm_name = firm_name
        if firm_type is not None:
            self.firm_type = firm_type
        if first_name is not None:
            self.first_name = first_name
        if gender is not None:
            self.gender = gender
        if group is not None:
            self.group = group
        if hydro_id is not None:
            self.hydro_id = hydro_id
        if id is not None:
            self.id = id
        if identification_number is not None:
            self.identification_number = identification_number
        if identification_number_type is not None:
            self.identification_number_type = identification_number_type
        if image is not None:
            self.image = image
        if income is not None:
            self.income = income
        if is_active is not None:
            self.is_active = is_active
        if is_verified is not None:
            self.is_verified = is_verified
        if last_name is not None:
            self.last_name = last_name
        if liquid_net_worth is not None:
            self.liquid_net_worth = liquid_net_worth
        if metadata is not None:
            self.metadata = metadata
        if middle_name is not None:
            self.middle_name = middle_name
        if password is not None:
            self.password = password
        if phone_number is not None:
            self.phone_number = phone_number
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if status is not None:
            self.status = status
        if suffix is not None:
            self.suffix = suffix
        if title is not None:
            self.title = title
        if total_net_worth is not None:
            self.total_net_worth = total_net_worth
        if update_date is not None:
            self.update_date = update_date
        self.username = username

    @property
    def address(self):
        """Gets the address of this Client.  # noqa: E501


        :return: The address of this Client.  # noqa: E501
        :rtype: list[ClientAddress]
        """
        return self._address

    @address.setter
    def address(self, address):
        """Sets the address of this Client.


        :param address: The address of this Client.  # noqa: E501
        :type: list[ClientAddress]
        """

        self._address = address

    @property
    def authorities(self):
        """Gets the authorities of this Client.  # noqa: E501

        authorities  # noqa: E501

        :return: The authorities of this Client.  # noqa: E501
        :rtype: list[str]
        """
        return self._authorities

    @authorities.setter
    def authorities(self, authorities):
        """Sets the authorities of this Client.

        authorities  # noqa: E501

        :param authorities: The authorities of this Client.  # noqa: E501
        :type: list[str]
        """

        self._authorities = authorities

    @property
    def business_id(self):
        """Gets the business_id of this Client.  # noqa: E501

        business_id  # noqa: E501

        :return: The business_id of this Client.  # noqa: E501
        :rtype: str
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id):
        """Sets the business_id of this Client.

        business_id  # noqa: E501

        :param business_id: The business_id of this Client.  # noqa: E501
        :type: str
        """

        self._business_id = business_id

    @property
    def citizenship_status(self):
        """Gets the citizenship_status of this Client.  # noqa: E501

        citizenshipStatus  # noqa: E501

        :return: The citizenship_status of this Client.  # noqa: E501
        :rtype: str
        """
        return self._citizenship_status

    @citizenship_status.setter
    def citizenship_status(self, citizenship_status):
        """Sets the citizenship_status of this Client.

        citizenshipStatus  # noqa: E501

        :param citizenship_status: The citizenship_status of this Client.  # noqa: E501
        :type: str
        """

        self._citizenship_status = citizenship_status

    @property
    def client_type(self):
        """Gets the client_type of this Client.  # noqa: E501

        clientTypeId  # noqa: E501

        :return: The client_type of this Client.  # noqa: E501
        :rtype: str
        """
        return self._client_type

    @client_type.setter
    def client_type(self, client_type):
        """Sets the client_type of this Client.

        clientTypeId  # noqa: E501

        :param client_type: The client_type of this Client.  # noqa: E501
        :type: str
        """
        self._client_type = client_type

    @property
    def country_of_citizenship(self):
        """Gets the country_of_citizenship of this Client.  # noqa: E501

        countryOfCitizenship  # noqa: E501

        :return: The country_of_citizenship of this Client.  # noqa: E501
        :rtype: list[str]
        """
        return self._country_of_citizenship

    @country_of_citizenship.setter
    def country_of_citizenship(self, country_of_citizenship):
        """Sets the country_of_citizenship of this Client.

        countryOfCitizenship  # noqa: E501

        :param country_of_citizenship: The country_of_citizenship of this Client.  # noqa: E501
        :type: list[str]
        """

        self._country_of_citizenship = country_of_citizenship

    @property
    def country_of_residence(self):
        """Gets the country_of_residence of this Client.  # noqa: E501

        countryOfResidence  # noqa: E501

        :return: The country_of_residence of this Client.  # noqa: E501
        :rtype: str
        """
        return self._country_of_residence

    @country_of_residence.setter
    def country_of_residence(self, country_of_residence):
        """Sets the country_of_residence of this Client.

        countryOfResidence  # noqa: E501

        :param country_of_residence: The country_of_residence of this Client.  # noqa: E501
        :type: str
        """

        self._country_of_residence = country_of_residence

    @property
    def create_date(self):
        """Gets the create_date of this Client.  # noqa: E501


        :return: The create_date of this Client.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this Client.


        :param create_date: The create_date of this Client.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def date_of_birth(self):
        """Gets the date_of_birth of this Client.  # noqa: E501

        dateOfBirth  # noqa: E501

        :return: The date_of_birth of this Client.  # noqa: E501
        :rtype: str
        """
        return self._date_of_birth

    @date_of_birth.setter
    def date_of_birth(self, date_of_birth):
        """Sets the date_of_birth of this Client.

        dateOfBirth  # noqa: E501

        :param date_of_birth: The date_of_birth of this Client.  # noqa: E501
        :type: str
        """

        self._date_of_birth = date_of_birth

    @property
    def email(self):
        """Gets the email of this Client.  # noqa: E501

        email  # noqa: E501

        :return: The email of this Client.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this Client.

        email  # noqa: E501

        :param email: The email of this Client.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def employment(self):
        """Gets the employment of this Client.  # noqa: E501


        :return: The employment of this Client.  # noqa: E501
        :rtype: Employment
        """
        return self._employment

    @employment.setter
    def employment(self, employment):
        """Sets the employment of this Client.


        :param employment: The employment of this Client.  # noqa: E501
        :type: Employment
        """

        self._employment = employment

    @property
    def firm_name(self):
        """Gets the firm_name of this Client.  # noqa: E501

        firmName  # noqa: E501

        :return: The firm_name of this Client.  # noqa: E501
        :rtype: str
        """
        return self._firm_name

    @firm_name.setter
    def firm_name(self, firm_name):
        """Sets the firm_name of this Client.

        firmName  # noqa: E501

        :param firm_name: The firm_name of this Client.  # noqa: E501
        :type: str
        """

        self._firm_name = firm_name

    @property
    def firm_type(self):
        """Gets the firm_type of this Client.  # noqa: E501

        firmType  # noqa: E501

        :return: The firm_type of this Client.  # noqa: E501
        :rtype: str
        """
        return self._firm_type

    @firm_type.setter
    def firm_type(self, firm_type):
        """Sets the firm_type of this Client.

        firmType  # noqa: E501

        :param firm_type: The firm_type of this Client.  # noqa: E501
        :type: str
        """

        self._firm_type = firm_type

    @property
    def first_name(self):
        """Gets the first_name of this Client.  # noqa: E501

        firstName  # noqa: E501

        :return: The first_name of this Client.  # noqa: E501
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this Client.

        firstName  # noqa: E501

        :param first_name: The first_name of this Client.  # noqa: E501
        :type: str
        """

        self._first_name = first_name

    @property
    def gender(self):
        """Gets the gender of this Client.  # noqa: E501

        gender  # noqa: E501

        :return: The gender of this Client.  # noqa: E501
        :rtype: str
        """
        return self._gender

    @gender.setter
    def gender(self, gender):
        """Sets the gender of this Client.

        gender  # noqa: E501

        :param gender: The gender of this Client.  # noqa: E501
        :type: str
        """

        self._gender = gender

    @property
    def group(self):
        """Gets the group of this Client.  # noqa: E501

        group  # noqa: E501

        :return: The group of this Client.  # noqa: E501
        :rtype: list[str]
        """
        return self._group

    @group.setter
    def group(self, group):
        """Sets the group of this Client.

        group  # noqa: E501

        :param group: The group of this Client.  # noqa: E501
        :type: list[str]
        """

        self._group = group

    @property
    def hydro_id(self):
        """Gets the hydro_id of this Client.  # noqa: E501

        hydroId  # noqa: E501

        :return: The hydro_id of this Client.  # noqa: E501
        :rtype: str
        """
        return self._hydro_id

    @hydro_id.setter
    def hydro_id(self, hydro_id):
        """Sets the hydro_id of this Client.

        hydroId  # noqa: E501

        :param hydro_id: The hydro_id of this Client.  # noqa: E501
        :type: str
        """

        self._hydro_id = hydro_id

    @property
    def id(self):
        """Gets the id of this Client.  # noqa: E501


        :return: The id of this Client.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Client.


        :param id: The id of this Client.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def identification_number(self):
        """Gets the identification_number of this Client.  # noqa: E501

        identificationNumber  # noqa: E501

        :return: The identification_number of this Client.  # noqa: E501
        :rtype: str
        """
        return self._identification_number

    @identification_number.setter
    def identification_number(self, identification_number):
        """Sets the identification_number of this Client.

        identificationNumber  # noqa: E501

        :param identification_number: The identification_number of this Client.  # noqa: E501
        :type: str
        """

        self._identification_number = identification_number

    @property
    def identification_number_type(self):
        """Gets the identification_number_type of this Client.  # noqa: E501

        identificationNumberType  # noqa: E501

        :return: The identification_number_type of this Client.  # noqa: E501
        :rtype: str
        """
        return self._identification_number_type

    @identification_number_type.setter
    def identification_number_type(self, identification_number_type):
        """Sets the identification_number_type of this Client.

        identificationNumberType  # noqa: E501

        :param identification_number_type: The identification_number_type of this Client.  # noqa: E501
        :type: str
        """

        self._identification_number_type = identification_number_type

    @property
    def image(self):
        """Gets the image of this Client.  # noqa: E501

        image  # noqa: E501

        :return: The image of this Client.  # noqa: E501
        :rtype: str
        """
        return self._image

    @image.setter
    def image(self, image):
        """Sets the image of this Client.

        image  # noqa: E501

        :param image: The image of this Client.  # noqa: E501
        :type: str
        """

        self._image = image

    @property
    def income(self):
        """Gets the income of this Client.  # noqa: E501

        income  # noqa: E501

        :return: The income of this Client.  # noqa: E501
        :rtype: int
        """
        return self._income

    @income.setter
    def income(self, income):
        """Sets the income of this Client.

        income  # noqa: E501

        :param income: The income of this Client.  # noqa: E501
        :type: int
        """

        self._income = income

    @property
    def is_active(self):
        """Gets the is_active of this Client.  # noqa: E501

        isActive  # noqa: E501

        :return: The is_active of this Client.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this Client.

        isActive  # noqa: E501

        :param is_active: The is_active of this Client.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def is_verified(self):
        """Gets the is_verified of this Client.  # noqa: E501

        isVerified  # noqa: E501

        :return: The is_verified of this Client.  # noqa: E501
        :rtype: bool
        """
        return self._is_verified

    @is_verified.setter
    def is_verified(self, is_verified):
        """Sets the is_verified of this Client.

        isVerified  # noqa: E501

        :param is_verified: The is_verified of this Client.  # noqa: E501
        :type: bool
        """

        self._is_verified = is_verified

    @property
    def last_name(self):
        """Gets the last_name of this Client.  # noqa: E501

        last_name  # noqa: E501

        :return: The last_name of this Client.  # noqa: E501
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """Sets the last_name of this Client.

        last_name  # noqa: E501

        :param last_name: The last_name of this Client.  # noqa: E501
        :type: str
        """

        self._last_name = last_name

    @property
    def liquid_net_worth(self):
        """Gets the liquid_net_worth of this Client.  # noqa: E501

        liquidNetWorth  # noqa: E501

        :return: The liquid_net_worth of this Client.  # noqa: E501
        :rtype: float
        """
        return self._liquid_net_worth

    @liquid_net_worth.setter
    def liquid_net_worth(self, liquid_net_worth):
        """Sets the liquid_net_worth of this Client.

        liquidNetWorth  # noqa: E501

        :param liquid_net_worth: The liquid_net_worth of this Client.  # noqa: E501
        :type: float
        """

        self._liquid_net_worth = liquid_net_worth

    @property
    def metadata(self):
        """Gets the metadata of this Client.  # noqa: E501

        metadata  # noqa: E501

        :return: The metadata of this Client.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this Client.

        metadata  # noqa: E501

        :param metadata: The metadata of this Client.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def middle_name(self):
        """Gets the middle_name of this Client.  # noqa: E501

        middleName  # noqa: E501

        :return: The middle_name of this Client.  # noqa: E501
        :rtype: str
        """
        return self._middle_name

    @middle_name.setter
    def middle_name(self, middle_name):
        """Sets the middle_name of this Client.

        middleName  # noqa: E501

        :param middle_name: The middle_name of this Client.  # noqa: E501
        :type: str
        """

        self._middle_name = middle_name

    @property
    def password(self):
        """Gets the password of this Client.  # noqa: E501

        password  # noqa: E501

        :return: The password of this Client.  # noqa: E501
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this Client.

        password  # noqa: E501

        :param password: The password of this Client.  # noqa: E501
        :type: str
        """

        self._password = password

    @property
    def phone_number(self):
        """Gets the phone_number of this Client.  # noqa: E501

        phoneNumber  # noqa: E501

        :return: The phone_number of this Client.  # noqa: E501
        :rtype: str
        """
        return self._phone_number

    @phone_number.setter
    def phone_number(self, phone_number):
        """Sets the phone_number of this Client.

        phoneNumber  # noqa: E501

        :param phone_number: The phone_number of this Client.  # noqa: E501
        :type: str
        """

        self._phone_number = phone_number

    @property
    def secondary_id(self):
        """Gets the secondary_id of this Client.  # noqa: E501


        :return: The secondary_id of this Client.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this Client.


        :param secondary_id: The secondary_id of this Client.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def status(self):
        """Gets the status of this Client.  # noqa: E501

        status  # noqa: E501

        :return: The status of this Client.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this Client.

        status  # noqa: E501

        :param status: The status of this Client.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def suffix(self):
        """Gets the suffix of this Client.  # noqa: E501

        suffix  # noqa: E501

        :return: The suffix of this Client.  # noqa: E501
        :rtype: str
        """
        return self._suffix

    @suffix.setter
    def suffix(self, suffix):
        """Sets the suffix of this Client.

        suffix  # noqa: E501

        :param suffix: The suffix of this Client.  # noqa: E501
        :type: str
        """

        self._suffix = suffix

    @property
    def title(self):
        """Gets the title of this Client.  # noqa: E501

        title  # noqa: E501

        :return: The title of this Client.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this Client.

        title  # noqa: E501

        :param title: The title of this Client.  # noqa: E501
        :type: str
        """

        self._title = title

    @property
    def total_net_worth(self):
        """Gets the total_net_worth of this Client.  # noqa: E501

        totalNetWorth  # noqa: E501

        :return: The total_net_worth of this Client.  # noqa: E501
        :rtype: float
        """
        return self._total_net_worth

    @total_net_worth.setter
    def total_net_worth(self, total_net_worth):
        """Sets the total_net_worth of this Client.

        totalNetWorth  # noqa: E501

        :param total_net_worth: The total_net_worth of this Client.  # noqa: E501
        :type: float
        """

        self._total_net_worth = total_net_worth

    @property
    def update_date(self):
        """Gets the update_date of this Client.  # noqa: E501


        :return: The update_date of this Client.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this Client.


        :param update_date: The update_date of this Client.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

    @property
    def username(self):
        """Gets the username of this Client.  # noqa: E501

        username  # noqa: E501

        :return: The username of this Client.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this Client.

        username  # noqa: E501

        :param username: The username of this Client.  # noqa: E501
        :type: str
        """

        self._username = username

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
        if issubclass(Client, dict):
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
        if not isinstance(other, Client):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Client):
            return True

        return self.to_dict() != other.to_dict()
