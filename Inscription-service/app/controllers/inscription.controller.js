const db = require("../models");
const Inscription = db.tutorials;

// Create and Save a new Inscription
exports.create = (req, res) => {
  // Validate request
  if (!req.body.id || !req.body.classe || !req.body.groupe || !req.body.date) {
    res.status(400).send({ message: "All fields are required!" });
    return;
  }

  // Create an Inscription
  const inscription = new Inscription({
    id: req.body.id,
    classe: req.body.classe,
    groupe: req.body.groupe,
    date: req.body.date
  });

  // Save Inscription in the database
  inscription
      .save()
      .then(data => {
        res.send(data);
      })
      .catch(err => {
        res.status(500).send({
          message:
              err.message || "Some error occurred while creating the Inscription."
        });
      });
};

// Retrieve all Inscriptions from the database.
exports.findAll = (req, res) => {
  Inscription.find({})
      .then(data => {
        res.send(data);
      })
      .catch(err => {
        res.status(500).send({
          message:
              err.message || "Some error occurred while retrieving inscriptions."
        });
      });
};

// Find a single Inscription with an id
exports.findOne = (req, res) => {
  const id = req.params.id;

  Inscription.findById(id)
      .then(data => {
        if (!data)
          res.status(404).send({ message: "Not found Inscription with id " + id });
        else res.send(data);
      })
      .catch(err => {
        res
            .status(500)
            .send({ message: "Error retrieving Inscription with id=" + id });
      });
};

// Update an Inscription by the id in the request
exports.update = (req, res) => {
  if (!req.body) {
    return res.status(400).send({
      message: "Data to update can not be empty!"
    });
  }

  const id = req.params.id;

  Inscription.findByIdAndUpdate(id, req.body, { useFindAndModify: false })
      .then(data => {
        if (!data) {
          res.status(404).send({
            message: `Cannot update Inscription with id=${id}. Maybe Inscription was not found!`
          });
        } else res.send({ message: "Inscription was updated successfully." });
      })
      .catch(err => {
        res.status(500).send({
          message: "Error updating Inscription with id=" + id
        });
      });
};

// Delete an Inscription with the specified id in the request
exports.delete = (req, res) => {
  const id = req.params.id;

  Inscription.findByIdAndRemove(id, { useFindAndModify: false })
      .then(data => {
        if (!data) {
          res.status(404).send({
            message: `Cannot delete Inscription with id=${id}. Maybe Inscription was not found!`
          });
        } else {
          res.send({
            message: "Inscription was deleted successfully!"
          });
        }
      })
      .catch(err => {
        res.status(500).send({
          message: "Could not delete Inscription with id=" + id
        });
      });
};
