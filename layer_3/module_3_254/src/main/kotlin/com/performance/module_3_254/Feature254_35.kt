package com.performance.module_3_254

class Feature254UseCase1(
    private val repository: Feature254Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
