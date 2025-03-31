package com.performance.module_2_144

class Feature144UseCase1(
    private val repository: Feature144Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
