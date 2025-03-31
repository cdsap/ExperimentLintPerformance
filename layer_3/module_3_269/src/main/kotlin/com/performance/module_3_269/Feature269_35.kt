package com.performance.module_3_269

class Feature269UseCase1(
    private val repository: Feature269Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
